package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous (name = "test2")
public class AutoP extends LinearOpMode {
    DcMotor FL, FR, RL, RR, MM;
    Servo Ser;

    @Override
    public void runOpMode() {
        FL = hardwareMap.dcMotor.get("fl");
        FR = hardwareMap.dcMotor.get("fr");
        RL = hardwareMap.dcMotor.get("rl");
        RR = hardwareMap.dcMotor.get("rr");
        MM = hardwareMap.dcMotor.get("mm");
        Ser = hardwareMap.servo.get("servo");

        waitForStart();
        if (opModeIsActive()) {
            //run
            FL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            FR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            MM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

            Ser.setPosition(0.5);


            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(2500);
            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
            sleep(1000);
            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(2000);
            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);


        }
    }
}

/*
FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
sleep(2500);
            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
sleep(1000);
            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
sleep(2000);
            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
*/