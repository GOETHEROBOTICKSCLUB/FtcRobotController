package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Press to kill Roma")
public class RomaSpiderMan extends LinearOpMode {
    DcMotor FL, FR, RL, RR, MM;
    Servo SerA;
    @Override
    public  void runOpMode() {
        FL = hardwareMap.dcMotor.get("fl");
        FR = hardwareMap.dcMotor.get("fr");
        RL = hardwareMap.dcMotor.get("rl");
        RR = hardwareMap.dcMotor.get("rr");
        MM = hardwareMap.dcMotor.get("mm");
        SerA = hardwareMap.servo.get("servo");

        waitForStart();
        if (opModeIsActive()){
            FL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            FR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

            SerA.setPosition(0);

            FL.setPower(-1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(1);
            sleep(3000);

            FL.setPower(-1);
            FR.setPower(-1);
            RL.setPower(-1);
            RR.setPower(-1);
            sleep(1000);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
            MM.setPower(-0.3);
            sleep(1000);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
            SerA.setPosition(0.5);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
            MM.setPower(0.2);
            sleep(1000);

            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
            sleep(1000);

            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(1500);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
            MM.setPower(-0.3);
            sleep(2000);

            SerA.setPosition(0);

            MM.setPower(0.3);
            sleep(2000);

            FL.setPower(-1);
            FR.setPower(1);
            RL.setPower(-1);
            RR.setPower(1);
            sleep(1500); //52

            FL.setPower(-1);
            FR.setPower(-1);
            RL.setPower(-1);
            RR.setPower(-1);
            sleep(1000);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
            MM.setPower(0.3);
            sleep(500);

            SerA.setPosition(0.5);

            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);
        }

    }

}

