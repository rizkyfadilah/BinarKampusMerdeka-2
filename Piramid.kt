class Piramid{
    fun piramidA(Size: Int){
        for (i in 0..Size) {
            for (j in 0..Size) {
                if (j >= i) {
                    print(' ')
                }
            }
            for (k in 0..Size) {
                if (k <= i) {
                    print('*')
                }
            }
            for (l in 1..Size){
                if(l <= i){
                    print ('*')
                }
            }
            println()
        }
    }
    fun piramidB(Size: Int){
        for (i in 0..Size) {
            for (j in 0..Size) {
                if (j <= i) {
                    print(' ')
                }
            }
            for (k in 0..Size) {
                if (k >= i) {
                    print('*')
                }
            }
            for (l in 0..(Size-1)){
                if(l >= i){
                    print ('*')
                }
            }
            println()
        }
    }
    fun piramidC(Size: Int){
        for (i in 0..Size) {
            for (j in 0..Size) {
                if (j >= i) {
                    print(' ')
                }
            }
            for (k in 0..Size) {
                if (k <= i) {
                    print('*')
                }
            }
            for (l in 1..Size){
                if(l <= i){
                    print ('*')
                }
            }
            println()
        }
        for (i in 0..(Size+1)) {
            for (j in 1..Size+1) {
                if (j <= i) {
                    print(' ')
                }
            }
            for (k in 0..(Size+1)) {
                if (k >= i) {
                    print('*')
                }
            }
            for (l in 0..(Size)){
                if(l >= i){
                    print ('*')
                }
            }
            println()
        }
    }
    fun piramidD(Size: Int){
        for (i in 0..Size) {
            for (j in 1..Size) {
                if (j <= i) {
                    print(' ')
                }
            }
            for (k in 0..(Size)) {
                if (k >= i) {
                    if (k == i){
                        print('*')
                    }else{
                        print(' ')
                    }

                }
            }
            for (l in 0..(Size)) {
                if (l >= i) {
                    if (l == (Size-1)){
                        print('*')
                    }else{
                        print(' ')
                    }

                }
            }
            println()
        }
        for (i in 1..Size){
            for (j in 1..(Size-1)) {
                if (j >= i) {
                    print(' ')
                }
            }
            for (k in 0..(Size)) {
                if (k <= i) {
                    if (k == 0){
                        print('*')
                    }else{
                        print(' ')
                    }

                }
            }
            for (l in 1..Size) {
                if (l <= i) {
                    if (l == i){
                        print('*')
                    }else{
                        print(' ')
                    }

                }
            }
            println()
        }
    }
    fun piramidE(Size: Int){
        for (i in 0..Size){
            for (j in 0..Size){
                if(j <= i){
                    print('*')
                }
            }
            println()
        }
    }
}
