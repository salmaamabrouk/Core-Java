import java.util.function.Function;
public class ConvertTemp implements Function<Float, Float>
{
@Override
public Float apply(Float t) {
Float fahr = (float) ((t * 1.8) + 32);
return fahr;
}
}