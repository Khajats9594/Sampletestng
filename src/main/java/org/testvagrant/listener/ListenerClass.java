package org.testvagrant.listener;

import com.testvagrant.elastic.UploadToElasticSearch;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerClass implements ITestListener {
    UploadToElasticSearch elastic = new UploadToElasticSearch();

    @Override
    public void onTestSuccess(ITestResult result) {
         elastic.uploadToElasticSearch(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
         elastic.uploadToElasticSearch(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
         elastic.uploadToElasticSearch(result);
    }

    @Override
    public void onTestStart(ITestResult result) {
        //
    }
}
