package com.rock.snail.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 *
 */
public class EffectiveParenthese {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');map.put('}','{');map.put('[',']');map.put(']','[');map.put('(',')');map.put(')','(');
        Character[] character = new Character[]{'(','[',']',')'};
        for (Character ch : character) {
            Character peek = null;
            if(!stack.empty()){
                peek = stack.peek();
            }
            Character value = map.get(ch);
            if (Objects.equals(value,peek)){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        System.out.println("是否是有效字符:"+stack.empty());

    }
}
