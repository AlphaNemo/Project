# Project · 中国象棋

这是 CS109 的中国象棋课程起始项目。`XiangQi_original_code/XiangQi` 使用 Java Swing 绘制棋盘和棋子，并支持鼠标选子和尝试走子。初始棋盘摆放了红方的帅、仕、相和马。完整棋子配置、回合切换、吃子、将军和胜负判定仍待实现。

## 运行

项目配置使用 JDK 21，无需安装第三方依赖。用 IntelliJ IDEA 打开 `XiangQi_original_code/XiangQi`，选择 JDK 21，然后运行 `edu.sustech.xiangqi.Main`。

也可以在仓库根目录使用 PowerShell 编译和启动：

```powershell
Set-Location XiangQi_original_code/XiangQi
$sources = @(Get-ChildItem src/main/java -Recurse -Filter *.java | Select-Object -ExpandProperty FullName)
javac -encoding UTF-8 -d out $sources
if ($LASTEXITCODE -eq 0) {
    java -cp out edu.sustech.xiangqi.Main
}
```

用鼠标左键点击棋子，再点击目标交叉点。再次点击已选中的棋子可取消选择。

## 源码结构

源码位于 `XiangQi_original_code/XiangQi/src/main/java/edu/sustech/xiangqi`。

- `Main.java` 启动 Swing 界面。
- `model` 保存棋盘、棋子和走子规则。
- `view` 绘制窗口、棋盘和棋子。
- `controller` 处理鼠标输入和选子状态。
