
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.047.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrsIdDsclsrRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.047.001.03")
public class MxSeev04700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrsIdDsclsrRspn", required = true)
    protected ShareholdersIdentificationDisclosureResponseV03 shrhldrsIdDsclsrRspn;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 47;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountOwnershipType5Code.class, AccountSubLevel24 .class, AccountSubLevel25 .class, ActivityIndicator1Choice.class, AddressType2Code.class, ContactIdentification2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth2 .class, DateCode20Choice.class, DateFormat46Choice.class, DateFormat57Choice.class, DateType1Code.class, Disclosure3Choice.class, DisclosureRequestIdentification1 .class, Eligibility1Code.class, FinancialInstrumentQuantity18Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, InvestorType1Choice.class, MxSeev04700103 .class, NameAndAddress17 .class, NamePrefix1Code.class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NoReasonCode.class, OtherIdentification1 .class, Ownership1 .class, OwnershipType3Choice.class, Pagination1 .class, PartyIdentification195Choice.class, PartyIdentification198Choice.class, PartyIdentification201 .class, PartyIdentification202 .class, PartyIdentification205Choice.class, PartyIdentification217 .class, PartyIdentification218 .class, PartyIdentification219 .class, PartyIdentification275 .class, PartyIdentification276 .class, PartyRole2Code.class, PartyRole6Choice.class, PersonName1 .class, PersonName2 .class, PersonName3 .class, PostalAddress26 .class, SafekeepingAccount17 .class, SecurityIdentification19 .class, ShareholdersIdentificationDisclosureResponseV03 .class, ShareholdingBalance1 .class, ShareholdingType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.047.001.03";

    public MxSeev04700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04700103(final String xml) {
        this();
        MxSeev04700103 tmp = parse(xml);
        shrhldrsIdDsclsrRspn = tmp.getShrhldrsIdDsclsrRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrsIdDsclsrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdersIdentificationDisclosureResponseV03 }
     *     
     */
    public ShareholdersIdentificationDisclosureResponseV03 getShrhldrsIdDsclsrRspn() {
        return shrhldrsIdDsclsrRspn;
    }

    /**
     * Sets the value of the shrhldrsIdDsclsrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdersIdentificationDisclosureResponseV03 }
     *     
     */
    public MxSeev04700103 setShrhldrsIdDsclsrRspn(ShareholdersIdentificationDisclosureResponseV03 value) {
        this.shrhldrsIdDsclsrRspn = value;
        return this;
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
    public static MxSeev04700103 parse(String xml) {
        return ((MxSeev04700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04700103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04700103) parserImpl.read(MxSeev04700103 .class, xml, _classes));
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
     * Creates an MxSeev04700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04700103 message
     * @return
     *     a new instance of MxSeev04700103
     */
    public static final MxSeev04700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04700103 .class);
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

}
