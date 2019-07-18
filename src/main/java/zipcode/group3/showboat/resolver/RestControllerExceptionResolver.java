package zipcode.group3.showboat.resolver;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RestControllerExceptionResolver extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException
            (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelMap model = new ModelMap();
        String httpStatus = String.valueOf(response.getStatus());
        String url = "https://http.cat/" + httpStatus;
        model.addAttribute("attribute", "forwardWithForwardPrefix");
        return new ModelAndView("forward:/" + url, model);
    }
}
