package com.cwf.jpmorgan.cwf;

public class Survey {
    public String schoolid;
    public String quesid;
    public String Answer;

Survey()
{

}
    void Surveyenter(String schoolid,String quesid,String Answer)
    {
        this.Answer=Answer;
        this.quesid=quesid;
        this.schoolid=schoolid;

    }


}
