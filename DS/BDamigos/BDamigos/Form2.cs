using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace BDamigos
{
    public partial class Form2 : Form
    {
        private MySqlConnection mCon;
        private MySqlDataAdapter mAdapter;
        private DataSet mDs;
        public Form2()
        {
            InitializeComponent();
            try
            {
                DataSet mDs = new DataSet();
                mCon = new MySqlConnection("Persist Security Info=false;" +
                    "server=localhost; database=tbl_amigo; uid=root;pwd=1234");
                mCon.Open();
                carregacombo();
            }
            catch (Exception erro)
            {
                MessageBox.Show("Resposta: " + erro.ToString(), "Erro",
                MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    
        public void carregacombo()
        {

        MySqlCommand SQL = new MySqlCommand("select amg_nome from tbl_lula", mCon);
        MySqlDataReader MySqlDR = SQL.ExecuteReader();
        while (MySqlDR.Read())
            {
                comboBox1.Items.Add(MySqlDR["amg_nome"].ToString());
            }
              MySqlDR.Close();
        }

        private void btnVizu_Click(object sender, EventArgs e)
        {
            carregacombo();
            MySqlCommand SQL = new MySqlCommand("select * from tbl_lula where amg_nome=@nomePesquisado", mCon);
            SQL.Parameters.AddWithValue("@NomePesquisado", comboBox1.Text);
            MySqlDataReader MySqlDR2 = SQL.ExecuteReader();
            MySqlDR2.Read();
            lblNome.Text = "Nome: " + MySqlDR2["amg_nome"].ToString();
            lblTelefone.Text = "Telefone: " + MySqlDR2["amg_telefone"].ToString();
            lblEmail.Text = "E-mail: " + MySqlDR2["amg_email"].ToString();
            lblCPF.Text = "CPF: " + MySqlDR2["amg_CPF"].ToString();
            groupBox1.Visible = true;
            MySqlDR2.Close();
        }

        private void btnAlterar_Click(object sender, EventArgs e)
        {
            Form2 alterar = new Form2();
            alterar.Show();

            Form2 visu = new Form2();
            visu.Close();
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            MySqlCommand SQL = new MySqlCommand("delete from tbl_lula where amg_nome = @NomePesquisado", mCon);
            SQL.Parameters.AddWithValue("@NomePesquisado", comboBox1.Text);
            MySqlDataReader MySqlDR2 = SQL.ExecuteReader();
            MySqlDR2.Close();
            comboBox1.Text = "";
            carregacombo();
            MySqlCommand SQL1 = new MySqlCommand("select amg_nome from tbl_amigo", mCon);
            MySqlDataReader MySqlDR = SQL.ExecuteReader();
            while (MySqlDR.Read())
            {
                comboBox1.Items.Add (MySqlDR["amg_nome"].ToString());
            }
            MySqlDR.Close();
        }

        private void comboBox1_SelectIndexChanged(object sender, EventArgs e)
        {
            carregacombo();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form3 a = new Form3();
            a.Show();
        }
    }
}
