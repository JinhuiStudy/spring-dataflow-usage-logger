package io.spring.dataflow.springdataflowlogger;

import java.util.HashMap;
import java.util.Map;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.cloud.stream.binder.test.InputDestination;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.converter.CompositeMessageConverter;
import org.springframework.messaging.converter.MessageConverter;

@SpringBootTest
//@ExtendWith(OutputCaptureExtension.class)
public class SpringDataflowLoggerApplicationTests {

    @Test
    public void contextLoads() {
    }

    // TODO 테스트 코드 확인
    @Test
    public void testUsageCostLogger(CapturedOutput output) {
//        try (ConfigurableApplicationContext context = new SpringApplicationBuilder(
//                TestChannelBinderConfiguration
//                        .getCompleteConfiguration(SpringApplication.class))
//                .web(WebApplicationType.NONE)
//                .run()) {
//
//            InputDestination source = context.getBean(InputDestination.class);
//
//            UsageCostDetail usageCostDetail = new UsageCostDetail();
//            usageCostDetail.setUserId("user1");
//            usageCostDetail.setCallCost(3.0);
//            usageCostDetail.setDataCost(5.0);
//
//            final MessageConverter converter = context.getBean(CompositeMessageConverter.class);
//            Map<String, Object> headers = new HashMap<>();
//            headers.put("contentType", "application/json");
//            MessageHeaders messageHeaders = new MessageHeaders(headers);
//            final Message<?> message = converter.toMessage(usageCostDetail, messageHeaders);
//
//            source.send(message);
//
//            Awaitility.await().until(output::getOut, value -> value.contains("{\"userId\": \"user1\", \"callCost\": \"3.0\", \"dataCost\": \"5.0\" }"));
//        }
    }
}