package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.CRServoImpl;
import com.qualcomm.robotcore.hardware.Servo;
/*
public class servo_prop extends LinearOpMode {
    Servo Ser;
    CRServo mini_motor;
    public void runOpMode ()
    {
        Ser = hardwareMap.servo.get("servo");
        mini_motor = hardwareMap.crservo.get("mm");
        Ser.setDirection(Servo.Direction.REVERSE);
        waitForStart();
        mini_motor.setPower(0);
        while (opModeIsActive())
        {
            if(gamepad1.x&&Ser.getPosition()<1) {
                Ser.setPosition(Ser.getPosition()+0.001);
                sleep(5);

            }
            if(gamepad1.b&&Ser.getPosition()>0)
            {
                Ser.setPosition(Ser.getPosition()-0.001);
                sleep(5);
            }
        }
    }
}
*/