package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Copyright (c) 2024
 * This class was written by the greatest FTA in Russian Robotics
 */
@TeleOp(name = "drive train sineP")
public class FullTele extends LinearOpMode {
    //define
    Servo Ser;
    DcMotor FL, FR, RL, RR, MM;
    double x = 0, y = 0, r = 0;
    double a,b;
    @Override
    public void runOpMode() {
        //initialization processes
        FL = hardwareMap.dcMotor.get("fl");
        FR = hardwareMap.dcMotor.get("fr");
        RL = hardwareMap.dcMotor.get("rl");
        RR = hardwareMap.dcMotor.get("rr");
        MM = hardwareMap.dcMotor.get("mm");
        Ser = hardwareMap.servo.get("servo");
        Ser.setDirection(Servo.Direction.REVERSE);


        waitForStart();
        MM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        MM.setPower(0);
        double f = 0.5;
        while(opModeIsActive()) {
            x = -gamepad1.left_stick_x;
            y = gamepad1.left_stick_y;
            r = -gamepad1.left_trigger + gamepad1.right_trigger;
            move(x, y, r);
            telemetry.addLine("hello world");
            telemetry.update(); //для вывода на экран(обнова экрана)
            telemetry.addLine("Roma");

            if(gamepad2.left_stick_x > 0){
                float x = gamepad2.left_stick_x;
                MM.setPower(x);
            }
            if(gamepad2.left_stick_x < 0){
                float x = gamepad2.left_stick_x;
                MM.setPower(x);
            }
            MM.setPower(0);

            a = -gamepad1.left_stick_x;
            b = gamepad1.left_stick_y;
            if (gamepad2.x && f <= 1) {
                f = f + 0.01;
                sleep(5);
            }
            if (gamepad2.b && f > 0.5) {
                f = f - 0.01;
                sleep(5);
            }
            Ser.setPosition(f);

        }
    }

    public void move(double x, double y, double r) {
        FL.setPower(-x-y+r);
        FR.setPower(-x+y+r);
        RL.setPower(x-y+r);
        RR.setPower(x+y+r);
    }
}

