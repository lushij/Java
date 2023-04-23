
    class Invoice {
        public void printInvoice() {
            System.out.println("This is the content of the invoice!");
        }
    }

    class Decorator extends Invoice {
        protected Invoice ticket;
        public Decorator(Invoice t){
            ticket = t;
        }
        public void printInvoice(){
            if (ticket != null) {
                ticket.printInvoice();
            }
        }
    }

    class HeadDecorator extends Decorator {
        public HeadDecorator(Invoice t){
            super(t);
        }
        public void printInvoice(){
            ticket.printInvoice();
            System.out.println("This is the header of the invoice! ");
        }
    }

    class FootDecorator extends Decorator {
        public FootDecorator(Invoice t){
            super(t);
        }
        public void printInvoice(){
            System.out.println("This is the footnote of the invoice! ");
            super.printInvoice();
        }
    }

    class Test {
        public static void main(String[] args){
            Invoice ticket;
            ticket = new FootDecorator(new HeadDecorator(new Invoice()));
            ticket.printInvoice();
            System.out.println("------------------");
            ticket = new FootDecorator(new Invoice());
            ticket.printInvoice();
        }
    }

