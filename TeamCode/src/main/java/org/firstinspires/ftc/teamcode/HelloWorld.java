
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

@TeleOp
public class HelloWorld extends OpMode {
//    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }

//    @Override
    public void loop() {
        if (gamepad1.a) {
            telemetry.addData("Gamepad", "A Button Pressed")
        }

    }
}