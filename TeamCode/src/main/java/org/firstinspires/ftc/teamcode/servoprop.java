package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "sineP")
public class servoprop  extends LinearOpMode {
    Servo Ser;
    //DcMotor serM;

    @Override
    public void runOpMode() {
       // serM = hardwareMap.dcMotor.get("mm");
        Ser = hardwareMap.servo.get("servo");
        Ser.setDirection(Servo.Direction.REVERSE);
        waitForStart();
        double f = 0.5;
        while (opModeIsActive()) {
            if (gamepad2.x) {
                f = f + 0.001;
                sleep(5);
            }
            if (gamepad2.b) {
                f = f - 0.001;
                sleep(5);
            }
            Ser.setPosition(f);
        }
    }
}