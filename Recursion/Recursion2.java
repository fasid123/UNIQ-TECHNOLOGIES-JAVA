class Recursion2 {
    int i = 1;
    void add(){
        System.out.println("Hello "+i); // hello 1
        if (i < 20){
	i++;
	add();
        }

	
       
    }
    public static void main(String[] args) {
        Recursion2 rec = new Recursion2();
        rec.add();
        
    }
}

// in this program we control  this recursion code  by avoid stackoverflow error - using condition.

// if we use this instead of loop - it consume more memory bcse every time stack frame create, so tedious process. so we use recursion where we need.

// it alternate of loops . but do recursion where requirement need.