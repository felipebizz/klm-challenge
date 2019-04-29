package com.challenge.klm.rest;

import com.challenge.klm.statistic.StatisticReport;
import com.challenge.klm.statistic.StatisticsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StatisticsController {

    private StatisticsBean statisticBean;

    @Autowired
    public StatisticsController(StatisticsBean statisticBean) {
        this.statisticBean = statisticBean;
    }

    @RequestMapping(method = GET, value = "/statistics", produces = "application/json; charset=UTF-8")
    public Callable<StatisticReport> stat() {
        return () -> statisticBean.getStatisticReport();
    }
}
