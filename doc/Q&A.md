# 1. 公有云环境下Agent-Manager无法消费Agent指标与错误日志

请检查 Agent-Manager 配置文件 application.yml 中配置的 Kafka ConsumerGroupId 配置项值（配置项：consumer.id） 在公有云 Kafka 服务是否开启使用，如未开启，需要开启。

