using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataReverse
{
    public class Rootobject
    {
        public Customer[] customers { get; set; }
        public Product[] products { get; set; }
        public Order[] Order { get; set; }
        public Invoice[] Invoice { get; set; }
        public Shipment[] shipment { get; set; }
    }

    public class Customer
    {
        public string company_name { get; set; }
        public string second_name { get; set; }
        public string sirname { get; set; }
        public string email { get; set; }
        public string jobtitle { get; set; }
        public string office_phone { get; set; }
        public string mobileno { get; set; }
        public string faxno { get; set; }
        public string street { get; set; }
        public string city { get; set; }
        public string state { get; set; }
        public string postal_code { get; set; }
        public string country { get; set; }
        public string web_site { get; set; }
        public string remarks { get; set; }
    }

    public class Product
    {
        public string id { get; set; }
        public string name { get; set; }
        public string brand { get; set; }
        public string country { get; set; }
    }

    public class Order
    {
        public string order_id { get; set; }
        public string order_date { get; set; }
        public Item[] item { get; set; }
        public string status { get; set; }
    }

    public class Item : Product
    {
        public string id { get; set; }
        public int qty { get; set; }
    }

    public class Invoice
    {
        public string invoice_id { get; set; }
        public string date { get; set; }
        public Order1[] order { get; set; }
        public int total { get; set; }
        public string status { get; set; }
    }

    public class Order1
    {
        public string id { get; set; }
    }

    public class Shipment
    {
        public string shipmentdate { get; set; }
        public string shipby { get; set; }
    }
}


