package com.shy.javapattens.state;

import com.shy.javapattens.state.dppquestion.BracketState;
import com.shy.javapattens.state.dppquestion.NumberState;
import com.shy.javapattens.state.dppquestion.OperateState;
import com.shy.javapattens.state.dppquestion.QuestionContext;
import org.junit.Test;

/**
 * Created by 29517 on 2016/4/11.
 */
public class Client {
    @Test
    public void test(){

        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
    }


    @Test
    public void testQuestionState(){
        NumberState numberState = new NumberState();
        OperateState operateState = new OperateState();
        BracketState bracketState = new BracketState();
        for(int i=0;i<20;i++){
            QuestionContext context = new QuestionContext(numberState, 20);
            context.request();
            context.setState(operateState);
            context.request();
            context.setState(numberState);
            context.request();
            context.setState(operateState);
            context.request();
            context.setState(numberState);
            context.request();

            context.setState(bracketState);
            context.request();
            context.request();
        }
    }
}
