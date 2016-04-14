package ca.pandp.bean.sub;

import ca.pandp.builder.BeanTemplate;

import javax.annotation.Nonnull;

/**
 * Created by Micha "Micha Did It" Pringle on Jun 15, 2015.
 * <p>
 * .
 */

@BeanTemplate
public interface NameDef {

    @Nonnull
    String getFirstName();

    @Nonnull
    String getLastName();

    String getMiddleName();

}
