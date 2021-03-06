package io.swagger.petstore.assertions.pet;

import io.swagger.petstore.models.pet.PetModel;
import io.swagger.petstore.models.pet.TagsItem;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link PetModel} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractPetModelAssert<S extends AbstractPetModelAssert<S, A>, A extends PetModel> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractPetModelAssert}</code> to make assertions on actual PetModel.
   * @param actual the PetModel we want to make assertions on.
   */
  protected AbstractPetModelAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual PetModel's category is equal to the given one.
   * @param category the given category to compare the actual PetModel's category to.
   * @return this assertion object.
   * @throws AssertionError - if the actual PetModel's category is not equal to the given one.
   */
  public S hasCategory(io.swagger.petstore.models.pet.Category category) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    io.swagger.petstore.models.pet.Category actualCategory = actual.getCategory();
    if (!Objects.areEqual(actualCategory, category)) {
      failWithMessage(assertjErrorMessage, actual, category, actualCategory);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's id is equal to the given one.
   * @param id the given id to compare the actual PetModel's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual PetModel's id is not equal to the given one.
   */
  public S hasId(Integer id) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's name is equal to the given one.
   * @param name the given name to compare the actual PetModel's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual PetModel's name is not equal to the given one.
   */
  public S hasName(String name) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls contains the given String elements.
   * @param photoUrls the given elements that should be contained in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls does not contain all given String elements.
   */
  public S hasPhotoUrls(String... photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (photoUrls == null) failWithMessage("Expecting photoUrls parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getPhotoUrls(), photoUrls);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls contains the given String elements in Collection.
   * @param photoUrls the given elements that should be contained in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls does not contain all given String elements.
   */
  public S hasPhotoUrls(java.util.Collection<? extends String> photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (photoUrls == null) {
      failWithMessage("Expecting photoUrls parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getPhotoUrls(), photoUrls.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls contains <b>only</b> the given String elements and nothing else in whatever order.
   * @param photoUrls the given elements that should be contained in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls does not contain all given String elements.
   */
  public S hasOnlyPhotoUrls(String... photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (photoUrls == null) failWithMessage("Expecting photoUrls parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getPhotoUrls(), photoUrls);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
   * @param photoUrls the given elements that should be contained in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls does not contain all given String elements.
   */
  public S hasOnlyPhotoUrls(java.util.Collection<? extends String> photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (photoUrls == null) {
      failWithMessage("Expecting photoUrls parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getPhotoUrls(), photoUrls.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls does not contain the given String elements.
   *
   * @param photoUrls the given elements that should not be in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls contains any given String elements.
   */
  public S doesNotHavePhotoUrls(String... photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (photoUrls == null) failWithMessage("Expecting photoUrls parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getPhotoUrls(), photoUrls);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's photoUrls does not contain the given String elements in Collection.
   *
   * @param photoUrls the given elements that should not be in actual PetModel's photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls contains any given String elements.
   */
  public S doesNotHavePhotoUrls(java.util.Collection<? extends String> photoUrls) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (photoUrls == null) {
      failWithMessage("Expecting photoUrls parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getPhotoUrls(), photoUrls.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel has no photoUrls.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's photoUrls is not empty.
   */
  public S hasNoPhotoUrls() {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have photoUrls but had :\n  <%s>";

    // check
    if (actual.getPhotoUrls().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getPhotoUrls());
    }

    // return the current assertion for method chaining
    return myself;
  }


  /**
   * Verifies that the actual PetModel's status is equal to the given one.
   * @param status the given status to compare the actual PetModel's status to.
   * @return this assertion object.
   * @throws AssertionError - if the actual PetModel's status is not equal to the given one.
   */
  public S hasStatus(String status) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting status of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualStatus = actual.getStatus();
    if (!Objects.areEqual(actualStatus, status)) {
      failWithMessage(assertjErrorMessage, actual, status, actualStatus);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags contains the given TagsItem elements.
   * @param tags the given elements that should be contained in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags does not contain all given TagsItem elements.
   */
  public S hasTags(TagsItem... tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags contains the given TagsItem elements in Collection.
   * @param tags the given elements that should be contained in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags does not contain all given TagsItem elements.
   */
  public S hasTags(java.util.Collection<? extends TagsItem> tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags contains <b>only</b> the given TagsItem elements and nothing else in whatever order.
   * @param tags the given elements that should be contained in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags does not contain all given TagsItem elements.
   */
  public S hasOnlyTags(TagsItem... tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags contains <b>only</b> the given TagsItem elements in Collection and nothing else in whatever order.
   * @param tags the given elements that should be contained in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags does not contain all given TagsItem elements.
   */
  public S hasOnlyTags(java.util.Collection<? extends TagsItem> tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags does not contain the given TagsItem elements.
   *
   * @param tags the given elements that should not be in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags contains any given TagsItem elements.
   */
  public S doesNotHaveTags(TagsItem... tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel's tags does not contain the given TagsItem elements in Collection.
   *
   * @param tags the given elements that should not be in actual PetModel's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags contains any given TagsItem elements.
   */
  public S doesNotHaveTags(java.util.Collection<? extends TagsItem> tags) {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // check that given TagsItem collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual PetModel has no tags.
   * @return this assertion object.
   * @throws AssertionError if the actual PetModel's tags is not empty.
   */
  public S hasNoTags() {
    // check that actual PetModel we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have tags but had :\n  <%s>";

    // check
    if (actual.getTags().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getTags());
    }

    // return the current assertion for method chaining
    return myself;
  }


}
