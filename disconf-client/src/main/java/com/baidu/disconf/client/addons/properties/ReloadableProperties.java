package com.baidu.disconf.client.addons.properties;

import java.util.Properties;

/**
 * 用于通知变动的属性值映射，
 * 若扩展继承此接口为一个接口，应该同时继承 java.util.Properties 接口。
 * 这个接口的实现类可以考虑参考扩展类  {@link DelegatingProperties} 。
 * === 以上翻译==
 * For Properties maps that notify about changes.
 * Would extend interface java.util.Properties if it were an interface.
 * Classes implementing this interface should consider extending {@link DelegatingProperties}.
 */
public interface ReloadableProperties {

    Properties getProperties();

    void addReloadablePropertiesListener(IReloadablePropertiesListener l);

    boolean removeReloadablePropertiesListener(IReloadablePropertiesListener l);
}
