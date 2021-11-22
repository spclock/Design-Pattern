package com.spc.interpreter.java;

import java.util.Arrays;

/**
 * 解释器模式： 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 *
 * 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 *
 * 主要解决：对于一些固定文法构建一个解释句子的解释器。
 * 如何解决：构建语法树，定义终结符与非终结符。
 * 关键代码：构建环境类，包含解释器之外的一些全局信息，一般是 HashMap。
 *
 * 应用场景： sql语言，cron表达式  等等
 *
 *
 * 传统的解决办法：一个方法里面写所有的解析判断等等操作，扩展性很差很麻烦
 * 解释器模式：继承expression接口就能扩展（但类会很多）。
 */
public class Main {

    public static void main(String[] args) {

        String get="GET www.baidu.com helloInterpreter";
        String send="POST www.baidu.com loginZhangSan111";

        //http发送的格式 :
        // 请求方法 网址 发送内容;-> 中间要一个空格分开
        HttpSender instance = HttpSender.getInstance();
        instance.sendRequest(get);
        instance.sendRequest(send);

    }
}
