
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
 * Class for acmt.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcctDtlsV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.004.001.01")
public class MxAcmt00400101
    extends AbstractMX
{

    @XmlElement(name = "GetAcctDtlsV01", required = true)
    protected GetAccountDetails getAcctDtlsV01;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, DistributionPolicy1Code.class, FinancialInstrument6 .class, FormOfSecurity1Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, GetAccountDetails.class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, Intermediary7 .class, InvestmentAccount19 .class, InvestmentAccountInformationType.class, InvestmentAccountSelection1 .class, MxAcmt00400101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PartyIdentification5Choice.class, PersonIdentificationType1Code.class, PostalAddress1 .class, SecurityIdentification1Choice.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.004.001.01";

    public MxAcmt00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00400101(final String xml) {
        this();
        MxAcmt00400101 tmp = parse(xml);
        getAcctDtlsV01 = tmp.getGetAcctDtlsV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcctDtlsV01 property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountDetails }
     *     
     */
    public GetAccountDetails getGetAcctDtlsV01() {
        return getAcctDtlsV01;
    }

    /**
     * Sets the value of the getAcctDtlsV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountDetails }
     *     
     */
    public MxAcmt00400101 setGetAcctDtlsV01(GetAccountDetails value) {
        this.getAcctDtlsV01 = value;
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
    public static MxAcmt00400101 parse(String xml) {
        return ((MxAcmt00400101) MxReadImpl.parse(MxAcmt00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00400101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00400101) parserImpl.read(MxAcmt00400101 .class, xml, _classes));
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
     * Creates an MxAcmt00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00400101 message
     * @return
     *     a new instance of MxAcmt00400101
     */
    public final static MxAcmt00400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt00400101 .class);
    }

}
