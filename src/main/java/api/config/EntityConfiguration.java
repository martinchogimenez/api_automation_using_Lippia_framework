package api.config;

import services.DelService;
import services.HourService;
import services.PostService;
import services.PutService;

public enum EntityConfiguration {


    HOUR {
        @Override
        public Class<?> getEntityService() { return HourService.class; }
    },
    POSTHOUR {
        @Override
        public Class<?> getEntityService() { return PostService.class; }
    },
    PUTHOUR {
        @Override
        public Class<?> getEntityService() { return PutService.class; }
    },
    DELHOUR {
        @Override
        public Class<?> getEntityService() { return DelService.class; }
    };

    public abstract Class<?> getEntityService();
}



