
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for business information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationSearchCriteria", propOrder = {
    "ref",
    "sbjt",
    "qlfr"
})
public class GeneralBusinessInformationSearchCriteria {

    @XmlElement(name = "Ref")
    protected List<String> ref;
    @XmlElement(name = "Sbjt")
    protected List<CharacterSearchChoice> sbjt;
    @XmlElement(name = "Qlfr")
    protected List<InformationQualifierType> qlfr;

    /**
     * Gets the value of the ref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ref property.
     */
    public List<String> getRef() {
        if (ref == null) {
            ref = new ArrayList<>();
        }
        return this.ref;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sbjt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbjt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterSearchChoice }
     * 
     * 
     * @return
     *     The value of the sbjt property.
     */
    public List<CharacterSearchChoice> getSbjt() {
        if (sbjt == null) {
            sbjt = new ArrayList<>();
        }
        return this.sbjt;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationQualifierType }
     * 
     * 
     * @return
     *     The value of the qlfr property.
     */
    public List<InformationQualifierType> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<>();
        }
        return this.qlfr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the ref list.
     * @see #getRef()
     * 
     */
    public GeneralBusinessInformationSearchCriteria addRef(String ref) {
        getRef().add(ref);
        return this;
    }

    /**
     * Adds a new item to the sbjt list.
     * @see #getSbjt()
     * 
     */
    public GeneralBusinessInformationSearchCriteria addSbjt(CharacterSearchChoice sbjt) {
        getSbjt().add(sbjt);
        return this;
    }

    /**
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public GeneralBusinessInformationSearchCriteria addQlfr(InformationQualifierType qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

}
