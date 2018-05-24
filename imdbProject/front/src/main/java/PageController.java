import net.deltax.dao.ActorsDAO;
import net.deltax.dao.MovieDAO;
import net.deltax.dao.ProducersDAO;
import net.deltax.dto.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
@Controller
public class PageController {

    @Autowired
    private MovieDAO movieDAO;

    @Autowired
    private ProducersDAO producersDAO;

    @Autowired
    private ActorsDAO actorsDAO;

    @RequestMapping(value={"/index"})
public ModelAndView mainFrame()
{
ModelAndView mv = new ModelAndView("page.jsp");
return  mv;
}
}
