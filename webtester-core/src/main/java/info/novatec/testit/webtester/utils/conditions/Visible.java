package info.novatec.testit.webtester.utils.conditions;

import com.google.common.base.Predicate;

import info.novatec.testit.webtester.pageobjects.PageObject;


/**
 * Predicate to be used in order to check if a {@link PageObject page object} is
 * visible.
 *
 * @since 0.9.9
 */
public class Visible implements Predicate<PageObject> {

    @Override
    public boolean apply(PageObject pageObject) {
        return pageObject.isVisible();
    }

    @Override
    public String toString() {
        return "visible";
    }

}
