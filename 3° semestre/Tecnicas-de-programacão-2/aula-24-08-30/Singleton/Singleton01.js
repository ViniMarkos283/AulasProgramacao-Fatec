class Singleton{
    constructor(){
        if(Singleton.instance == null){
            Singleton.instance = this;
            this.value = 0;
        }
        return Singleton.instance;
    }

    increment(){
        this.value += 1;
        console.log(`Value: ${this.value}`);
    }
}

// cliente
const s1 = new Singleton(); // todas usam somente uma instancia, salvando processamento
const s2 = new Singleton();
const s3 = new Singleton();
const s4 = new Singleton();

console.log(s1 == s2); // true

s1.increment();
s2.increment();
s3.increment();
s4.increment();