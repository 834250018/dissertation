package cn.ve.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * @author ve
 * @date 2023/3/24
 */
@Configuration
public class OpenAIConfig {
    public void te1() {
        System.out.println(11111);

        // 设置请求参数
        String prompt = "Hello, how are you?";
        int maxTokens = 5;
        String apiKey = "";
        String model = "text-davinci-003";

        // 创建HTTP请求
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        String jsonRequest = String.format("{\"prompt\":\"%s\",\"max_tokens\":%d,\"model\":\"%s\"}",
            prompt, maxTokens, model);
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonRequest, headers);

        // 发送HTTP请求
        String apiUrl = "https://api.openai.com/v1/completions";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class).getBody();

        // 处理响应
        System.out.println(response);

    }
}
