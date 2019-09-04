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
    public partial class Form5 : Form
    {
        private MySqlConnection mCon;
        private MySqlDataAdapter mAdapter;
        private DataSet mDs;
        public Form5()
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

        public void limpaCampos()
        {
            lblCodigo.Clear();
            lblNome.Clear();
            lblTelefone.Clear();
            lblEmail.Clear();
            lblCPF.Clear();

        }


        private void btnFechar_Click(object sender, EventArgs e)
        {
            DialogResult resultado = MessageBox.Show("Deseja sair do programa?", "Aviso", MessageBoxButtons.YesNo,
               MessageBoxIcon.Question);
            if (resultado == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void btnVizu_Click(object sender, EventArgs e)
        {
            try
            {

                MySqlCommand SQL = new MySqlCommand("select * from tbl_lula where amg_nome = @nomePesquisado", mCon);
                SQL.Parameters.AddWithValue("NomePesquisado", comboBox1.Text);
                SQL.Parameters.AddWithValue("@codigo", lblCodigo.Text);
                MySqlDataReader MySqlDR2 = SQL.ExecuteReader();
                MySqlDR2.Read();
                lblCodigo.Text = MySqlDR2["amg_cod"].ToString();
                lblNome.Text = MySqlDR2["amg_nome"].ToString();
                lblTelefone.Text = MySqlDR2["amg_telefone"].ToString();
                lblEmail.Text = MySqlDR2["amg_email"].ToString();
                lblCPF.Text = MySqlDR2["amg_CPF"].ToString();
                groupBox1.Visible = true;
                MySqlDR2.Close();
            }
            catch (Exception erro)
            {
                MessageBox.Show("Resposta:" + erro.ToString(), "Erro",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void btnAlterar_Click(object sender, EventArgs e)
        {
            try
            {
                MySqlCommand SQL = new MySqlCommand("update tbl_lula set amg_nome = @nome, amg_tel = @tel,"
                    + "amg_email = @email, amg_CPF = @CPF where amg_cod = @codigo and amg_nome = @NomePesquisado", mCon);
                SQL.Parameters.AddWithValue("@NomePesquisado", comboBox1.Text);
                SQL.Parameters.AddWithValue("@codigo", lblCodigo.Text);
                SQL.Parameters.AddWithValue("@nome", lblNome.Text);
                SQL.Parameters.AddWithValue("@tel", lblTelefone.Text);
                SQL.Parameters.AddWithValue("@email", lblEmail.Text);
                SQL.Parameters.AddWithValue("@CPF", lblCPF.Text);
                SQL.ExecuteNonQuery();

                MessageBox.Show("Cadastro ALterado");
                comboBox1.Text = "";
                comboBox1.Items.Clear();
                carregacombo();
            }
            catch (Exception erro)
            {
                MessageBox.Show("Resposta:" + erro.ToString(), "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            limpaCampos();
            btnVizu.Enabled = false;
           
            
        }
    }
}
