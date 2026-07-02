
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for InputChannelSessionList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelSessionList", propOrder = {
    "inptChnlSsnDtls"
})
public class InputChannelSessionList {

    @XmlElement(name = "InptChnlSsnDtls", required = true)
    protected List<InputChannelSessionDetails> inptChnlSsnDtls;

    /**
     * Gets the value of the inptChnlSsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inptChnlSsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInptChnlSsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputChannelSessionDetails }
     * 
     * 
     */
    public List<InputChannelSessionDetails> getInptChnlSsnDtls() {
        if (inptChnlSsnDtls == null) {
            inptChnlSsnDtls = new ArrayList<InputChannelSessionDetails>();
        }
        return this.inptChnlSsnDtls;
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
     * Adds a new item to the inptChnlSsnDtls list.
     * @see #getInptChnlSsnDtls()
     * 
     */
    public InputChannelSessionList addInptChnlSsnDtls(InputChannelSessionDetails inptChnlSsnDtls) {
        getInptChnlSsnDtls().add(inptChnlSsnDtls);
        return this;
    }

}
