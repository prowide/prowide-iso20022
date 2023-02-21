
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMgmtStsRptV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.006.001.01")
public class MxAcmt00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctMgmtStsRptV01", required = true)
    protected AccountManagementStatusReport acctMgmtStsRptV01;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountManagementStatus1Code.class, AccountManagementStatusAndReason1 .class, AccountManagementStatusReport.class, AdditionalReference3 .class, AddressType2Code.class, GenericIdentification1 .class, MxAcmt00600101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus5 .class, RejectedStatusReason6Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.006.001.01";

    public MxAcmt00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00600101(final String xml) {
        this();
        MxAcmt00600101 tmp = parse(xml);
        acctMgmtStsRptV01 = tmp.getAcctMgmtStsRptV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMgmtStsRptV01 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusReport }
     *     
     */
    public AccountManagementStatusReport getAcctMgmtStsRptV01() {
        return acctMgmtStsRptV01;
    }

    /**
     * Sets the value of the acctMgmtStsRptV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusReport }
     *     
     */
    public MxAcmt00600101 setAcctMgmtStsRptV01(AccountManagementStatusReport value) {
        this.acctMgmtStsRptV01 = value;
        return this;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAcmt00600101 parse(String xml) {
        return ((MxAcmt00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00600101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00600101) parserImpl.read(MxAcmt00600101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAcmt00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00600101 message
     * @return
     *     a new instance of MxAcmt00600101
     */
    public final static MxAcmt00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00600101 .class);
    }

}
