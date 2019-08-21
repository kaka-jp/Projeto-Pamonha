using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BDamigos
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
            txtNome.Focus();
        }

        void Limpar()
        {
            txtNome.Text = "";
            txtSenha.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String NOME = "";
            String SENHA = "";
            NOME = txtNome.Text;
            SENHA = txtSenha.Text;
            NOME = NOME.ToLower();

            if((NOME.Trim().Equals("")) || (SENHA.Trim().Equals("")))
            {
                MessageBox.Show("Não digite espaços nos campos nome ou senha!", "Ocorreu um Erro ao Autenticar",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
                Limpar();
            }
            else
            {
                if((NOME.Equals("sandro")) && (SENHA.Equals("123456")))
                {
                    MessageBox.Show("Usuário e senha corretos", "Acesso permitido", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    Form4 frmp = new Form4();
                    frmp.Show();
                    this.Visible = false;
                }
                else
                {
                    MessageBox.Show("Usuário ou senha inválida!", "Ocorreu um Erro ao Autenticar", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    Limpar();
                }
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Limpar();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult resultado = MessageBox.Show("Deseja sair do programa?", "Aviso", MessageBoxButtons.YesNo,
                MessageBoxIcon.Question);
            if( resultado == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
