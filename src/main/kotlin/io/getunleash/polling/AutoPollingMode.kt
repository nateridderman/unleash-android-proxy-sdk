package io.getunleash.polling

import java.time.Duration

class AutoPollingMode(val pollRateDuration: Duration, val togglesUpdatedListener: TogglesUpdatedListener = TogglesUpdatedListener {  }) : PollingMode {
    override fun pollingIdentifier(): String = "auto"

}