
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMgmtStsRptV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.006.001.02")
public class MxAcmt00600102
    extends AbstractMX
{

    @XmlElement(name = "AcctMgmtStsRptV02", required = true)
    protected AccountManagementStatusReportV02 acctMgmtStsRptV02;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountManagementStatus1Code.class, AccountManagementStatusAndReason1 .class, AccountManagementStatusReportV02 .class, AdditionalReference3 .class, AddressType2Code.class, GenericIdentification1 .class, MessageIdentification1 .class, MxAcmt00600102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus5 .class, RejectedStatusReason6Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.006.001.02";

    public MxAcmt00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00600102(final String xml) {
        this();
        MxAcmt00600102 tmp = parse(xml);
        acctMgmtStsRptV02 = tmp.getAcctMgmtStsRptV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMgmtStsRptV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusReportV02 }
     *     
     */
    public AccountManagementStatusReportV02 getAcctMgmtStsRptV02() {
        return acctMgmtStsRptV02;
    }

    /**
     * Sets the value of the acctMgmtStsRptV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusReportV02 }
     *     
     */
    public MxAcmt00600102 setAcctMgmtStsRptV02(AccountManagementStatusReportV02 value) {
        this.acctMgmtStsRptV02 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAcmt00600102 parse(String xml) {
        return ((MxAcmt00600102) MxReadImpl.parse(MxAcmt00600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00600102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00600102) parserImpl.read(MxAcmt00600102 .class, xml, _classes));
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
     * Creates an MxAcmt00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00600102 message
     * @return
     *     a new instance of MxAcmt00600102
     */
    public final static MxAcmt00600102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt00600102 .class);
    }

}
