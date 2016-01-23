package spring.injection.annotation.e1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring.config.start.AnnotationE1BConfig;

public final class Main2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationE1BConfig.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.print();
        printer.print();
        ((AbstractApplicationContext) context).close();
    }
}
