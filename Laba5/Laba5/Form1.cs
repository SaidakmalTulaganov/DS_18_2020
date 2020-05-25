using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Laba5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        localhost.MessageServiceService service = new localhost.MessageServiceService();
        private void button1_Click(object sender, EventArgs e)
        {
            lbl.Text = service.getMessage();
        }
    }
}
