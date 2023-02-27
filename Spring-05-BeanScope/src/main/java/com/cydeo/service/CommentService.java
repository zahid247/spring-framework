package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //when this class is created, it will create a new instance instead of SINGLETON scope
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy
/*
with lazy instantiation, @Components are not created till they are called
The other way, which is default way, called EAGER
 */
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

//    @Autowired
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;

        System.out.println("Lazy instantiation, should not print");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
