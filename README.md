# JetpackComposeErrorSample

The Project for Issue Tracker

https://issuetracker.google.com/issues/195273509

```
2021-08-03 01:01:53.104 4738-4738/jp.arsaga E/AndroidRuntime: FATAL EXCEPTION: main
    Process: jp.arsaga, PID: 4738
    java.lang.NoSuchMethodError: No static method setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V in class Landroidx/activity/compose/ComponentActivityKt; or its super classes (declaration of 'androidx.activity.compose.ComponentActivityKt' appears in /data/app/jp.arsaga-8V2c7bLt8GFvNb08OtkwTw==/base.apk)
        at jp.arsaga.MainActivity.onCreate(MainActivity.kt:16)
        at android.app.Activity.performCreate(Activity.java:7136)
        at android.app.Activity.performCreate(Activity.java:7127)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1271)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2893)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3048)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:78)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:108)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:68)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1808)
        at android.os.Handler.dispatchMessage(Handler.java:106)
        at android.os.Looper.loop(Looper.java:193)
        at android.app.ActivityThread.main(ActivityThread.java:6669)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:858)


```
