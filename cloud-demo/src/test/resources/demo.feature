# language: zh-CN
功能: Cucumber测试例子

  场景大纲: eating
  假如 there are <start> cucumbers
  当 I eat <eat> cucumbers
  那么 I should have <left> cucumbers

    例子:
      | start | eat | left |
      | 12    | 5   | 7    |
      | 20    | 5   | 15   |