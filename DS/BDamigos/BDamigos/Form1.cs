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
    public partial class Form1 : Form
    {
        private MySqlConnection mCon;
        private MySqlDataAdapter mAdapter;
        private DataSet mDs;

    
        public Form1()
        { 
            InitializeComponent();
        mDs = new DataSet();
        mCon = new MySqlConnection("Persist Security Info=false;" +
            "server =127.0.0.1;database=tbl_amigo;uid=root;Password=1234");

        mCon.Open();
        exibe();

        }
        public void exibe()
        {
            if (mCon.State == ConnectionState.Open)
            {
                mDs.Clear();
                mAdapter = new MySqlDataAdapter("Select * FROM tbl_lula", mCon);
                mAdapter.Fill(mDs, "dados");
                DataGridView1.DataSource = null;
                DataGridView1.Rows.Clear();
                DataGridView1.Refresh();
                DataGridView1.DataSource = mDs;
                DataGridView1.DataMember = "dados";
            }
        }
        public void limpa()
        {
            txtNome.Clear();
            txtEnd.Clear();
            txtCidade.Clear();
            txtIdade.Clear();
            
        }

        private void Cadastrar_Click(object sender, EventArgs e)
        {
            MySqlCommand SQL = new MySqlCommand("insert into tbl_lula(amg_nome,amg_telefone,amg_email,amg_CPF) values (@amgnome,@amgtelefone,@amgemail,@amgCPF)", mCon);

            SQL.Parameters.AddWithValue("@amgnome", txtNome.Text);
            SQL.Parameters.AddWithValue("@amgtelefone", txtEnd.Text);
            SQL.Parameters.AddWithValue("@amgemail", txtCidade.Text);
            SQL.Parameters.AddWithValue("@amgCPF", txtIdade.Text);
           
            SQL.ExecuteNonQuery();

            MessageBox.Show("cadastro realizado com sucesso");
            exibe();
            limpa();
        }

        private void DataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void txtResponsavel_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtIdade_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtCidade_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtEnd_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtNome_TextChanged(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 a = new Form2();
            a.Show();
        }
    }
}
