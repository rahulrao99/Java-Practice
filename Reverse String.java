class HelloWorld {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}

class TestHelloWorld {
    public static void main(String[] args) {
        System.out.println(HelloWorld.reverseString("Hello World!"));
    }
}
