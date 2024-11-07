# $OCL$ Translation (Object Constraint Language)



## 1. $OCL_{fo}$

### 1.1 论文中存在的问题

主要涉及 
- Fig.4 Syntax of $OCL_{fo}$
- Fig.5 Semantics of $OCL_{fo}$
- Fig.6 $OCL_{fo}$ normalization rewritings

1. Fig.4 中OCL-Bool产生式第10行中（OCL-Object=null，OCL-Object<>null），与Fig.5,6中不一致（OCL-Single=null，OCL-Single<>null），本工作中使用OCL-Single
2. Fig.4 中OCL-Set产生式最后一条（OCL-Single）会引起间接左递归（涉及OCL-Value最后两条产生式OCL-Set->min()，OCL-Set->max()，Antlr无法处理），本工作删掉OCL-Set的OCL-Single产生式，认为OCL-Single不是OCL-Set
3. Fig.6 中OCL-Bool的第1条规则（OCL-Bool or OCL-Bool）的rewrite规则会出现逻辑表达式中的括号符号，而Fig.4中没有定义括号规则，因此，本工作在OCL-Bool的产生式中增加了括号规则 '(' oclBool ')'    
4. Fig.6 中OCL-Bool的第8条规则（涉及exist变换为forall）等价关系错误，存在为真<->不是所有为假（文中为不是所有为真），本工作进行了修改
5. Fig.6 中OCL-Bool的13，14行右侧中的size（）没有展开，本工作将其展开为最终形式，->one()转换为size()<=1 and not ->isEmpty()
6. Fig.6 中变换规则不完全，如OCL-Set->isUnique(attr) 重写后的结果仍然包含implies
7. Fig.6 中关于size(), v.oclIsTypeOf(Class) 的规则变换后的形式如何实现？