package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        //idea
        // identify start index so where we're starting in the array to get  to the target
        //identify the target index where we're going
        //need to determine the minimum between the distance to the end of the array and the distance to the target
        // and we need to determine the minimum between the distancde to the start of the array and the distance to the target
//       int leftPointer = startIndex;
//       int leftCount = 0;
//       int rightPointer = startIndex;
//       int rightCount = 0;
//       int  targetIndex= cousins.indexOf(targetName);
//       while(leftPointer!=targetIndex && rightPointer!= targetIndex){
//           if(rightPointer == targetIndex){
//               return rightCount;
//
//           }else if(leftPointer==targetIndex){
//               return leftCount;
//           }
//           leftPointer--;
//           leftCount++;
//           rightPointer++;
//           rightCount++;
//
//           if(leftPointer==0&&leftPointer!=targetIndex){
//               leftPointer = cousins.size()-1;
//               leftCount++;
//           }
//           if(rightPointer==cousins.size()-1&&rightPointer!=targetIndex){
//               rightPointer=0;
//               rightCount++;
//           }
//       }
//       if(rightPointer==targetIndex){
//           return rightCount;
//       }else {
//           return leftCount;
//       }
        int  targetIndex = cousins.indexOf(targetName);
        int distanceFromLeft =0;
        int distanceFromRight =0;
        if(targetIndex> startIndex){
            distanceFromLeft = cousins.size()- (targetIndex-startIndex);//said cousins.length but meant cousins.size
            distanceFromRight =targetIndex- startIndex;
        }else{
            distanceFromLeft = startIndex-targetIndex;
            distanceFromRight = cousins.size() -(targetIndex-startIndex);

        }
        return Math.min(distanceFromLeft,distanceFromRight);//this last instruction is confusing, do you mean the minimum between 2 distances or the the distance
                        //between the left and right variables
        //also this didn't work for the second test case
        //otherwise this is probably the best way to give instructions basically pseudocode
        //it was the most straightforward set of examples

    }
}
