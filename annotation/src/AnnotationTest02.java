public class AnnotationTest02 {
    public static void main(String[] args) throws Exception{
        //判断这个AnnotationTest01类上是否有这个MyAnnotation注解
        Class<?> annotationTest01 = Class.forName("AnnotationTest01");
        System.out.println(annotationTest01.isAnnotationPresent(MyAnnotation.class));

        if(annotationTest01.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = annotationTest01.getAnnotation(MyAnnotation.class);
            System.out.println(annotation);
            System.out.println(annotation.name());
        }

        Class<?> aClass = Class.forName("java.lang.String");
        System.out.println(aClass.isAnnotationPresent(MyAnnotation.class));
    }
//    //不赞成，弃用，不宜用
//    @Deprecated
//    public static void doSome(){
//        System.out.println("do something");
//    }
//
//    //报错的原因：如果一个注解当中有属性，那么必须给属性赋值
//    @MyAnnotation(name="zhansgan")
//    public static void doOther(){
//        System.out.println("do other");
//    }
}
