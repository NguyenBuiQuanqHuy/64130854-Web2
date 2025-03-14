package huy.ntu.edu.BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BMIController {
	@RequestMapping(value = "bmi", method = RequestMethod.GET)
    public String showForm() {
        return "bmi"; 
    }
    
    @RequestMapping(value = "bmi", method = RequestMethod.POST)
    public String calculateBMI(ModelMap model, HttpServletRequest request) {
        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));
            
            if (weight <= 0 || height <= 0) {
                model.addAttribute("message", "Cân nặng và chiều cao phải lớn hơn 0");
                return "bmi";
            }
            
            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0; 
            String result;
            
            if (bmi < 18.5) {
                result = "Gầy";
            } else if (bmi < 24.9) {
                result = "Bình thường";
            } else if (bmi < 29.9) {
                result = "Thừa cân";
            } else {
                result = "Béo phì";
            }
            
            model.addAttribute("bmi", bmi);
            model.addAttribute("result", result);
            model.addAttribute("message", "Kết quả BMI của bạn: " + bmi + " - " + result);
            
        } catch (NumberFormatException e) {
            model.addAttribute("message", "Vui lòng nhập số hợp lệ");
        }
        
        return "bmi";
    }
}
