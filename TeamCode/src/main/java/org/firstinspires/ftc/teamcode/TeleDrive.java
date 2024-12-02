package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Copyright (c) 2024
 * This class was written by the greatest FTA in Russian Robotics
 */
@TeleOp(name = "drive train")
public class TeleDrive extends LinearOpMode {
    //define
    DcMotor FL, FR, RL, RR;
    double x = 0, y = 0, r = 0;
    @Override
    public void runOpMode() {
        //initialization processes
        FL = hardwareMap.dcMotor.get("fl");
        FR = hardwareMap.dcMotor.get("fr");
        RL = hardwareMap.dcMotor.get("rl");
        RR = hardwareMap.dcMotor.get("rr");

        waitForStart();
        while(opModeIsActive()) {
            x = gamepad1.left_stick_x;
            y = -gamepad1.left_stick_y;
            r = -gamepad1.left_trigger + gamepad1.right_trigger;
            move(x, y, r);
            telemetry.addLine("hello world");
            telemetry.update();
        }
    }

    public void move(double x, double y, double r) {
        FL.setPower(-x-y+r);
        FR.setPower(-x+y+r);
        RL.setPower(x-y+r);
        RR.setPower(x+y+r);
    }
}
