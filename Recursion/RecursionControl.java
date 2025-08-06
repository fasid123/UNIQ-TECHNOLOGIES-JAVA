class RecursionControl {
    int i = 1;

    void add(){
        //System.out.println("Hello "+i); // hello 1
        if (i < 3){
	i++;
	add();
        System.out.println("Call destroy");
        } 
      

        
    }
    public static void main(String[] args) {
        RecursionControl rec = new RecursionControl();
        rec.add();
        
    }
}

// in this code 5 time exce

// in this program we control  this recursion code  by avoid stackoverflow error - using condition.

// if we use this instead of loop - it consume more memory bcse every time stack frame create, so tedious process. so we use recursion where we need.

// it alternate of loops . but do recursion where requirement need.