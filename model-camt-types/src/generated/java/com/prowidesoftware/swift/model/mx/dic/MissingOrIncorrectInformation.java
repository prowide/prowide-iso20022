
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the reason for the UnableToApply. It can be missing and/or incorrect information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingOrIncorrectInformation", propOrder = {
    "mssngInf",
    "incrrctInf"
})
public class MissingOrIncorrectInformation {

    @XmlElement(name = "MssngInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyMissingInfo1Code> mssngInf;
    @XmlElement(name = "IncrrctInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyIncorrectInfo1Code> incrrctInf;

    /**
     * Gets the value of the mssngInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mssngInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMssngInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyMissingInfo1Code }
     * 
     * 
     * @return
     *     The value of the mssngInf property.
     */
    public List<UnableToApplyMissingInfo1Code> getMssngInf() {
        if (mssngInf == null) {
            mssngInf = new ArrayList<>();
        }
        return this.mssngInf;
    }

    /**
     * Gets the value of the incrrctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incrrctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncrrctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyIncorrectInfo1Code }
     * 
     * 
     * @return
     *     The value of the incrrctInf property.
     */
    public List<UnableToApplyIncorrectInfo1Code> getIncrrctInf() {
        if (incrrctInf == null) {
            incrrctInf = new ArrayList<>();
        }
        return this.incrrctInf;
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
     * Adds a new item to the mssngInf list.
     * @see #getMssngInf()
     * 
     */
    public MissingOrIncorrectInformation addMssngInf(UnableToApplyMissingInfo1Code mssngInf) {
        getMssngInf().add(mssngInf);
        return this;
    }

    /**
     * Adds a new item to the incrrctInf list.
     * @see #getIncrrctInf()
     * 
     */
    public MissingOrIncorrectInformation addIncrrctInf(UnableToApplyIncorrectInfo1Code incrrctInf) {
        getIncrrctInf().add(incrrctInf);
        return this;
    }

}
