
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.047.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrsIdDsclsrRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.047.001.02")
public class MxSeev04700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrsIdDsclsrRspn", required = true)
    protected ShareholdersIdentificationDisclosureResponseV02 shrhldrsIdDsclsrRspn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 47;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountOwnershipType5Code.class, AccountSubLevel22 .class, AccountSubLevel23 .class, AddressType2Code.class, ContactIdentification2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth2 .class, DateCode20Choice.class, DateFormat46Choice.class, DateFormat57Choice.class, DateType1Code.class, Disclosure2Choice.class, DisclosureRequestIdentification1 .class, Eligibility1Code.class, FinancialInstrumentQuantity18Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, InvestorType1Choice.class, MxSeev04700102 .class, NameAndAddress17 .class, NamePrefix1Code.class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NoReasonCode.class, OtherIdentification1 .class, Ownership1 .class, OwnershipType3Choice.class, Pagination1 .class, PartyIdentification195Choice.class, PartyIdentification198Choice.class, PartyIdentification201 .class, PartyIdentification202 .class, PartyIdentification205Choice.class, PartyIdentification217 .class, PartyIdentification218 .class, PartyIdentification219 .class, PartyIdentification237 .class, PartyIdentification243 .class, PartyRole2Code.class, PartyRole6Choice.class, PersonName1 .class, PersonName2 .class, PersonName3 .class, PostalAddress26 .class, SafekeepingAccount11 .class, SecurityIdentification19 .class, ShareholdersIdentificationDisclosureResponseV02 .class, ShareholdingBalance1 .class, ShareholdingType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.047.001.02";

    public MxSeev04700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04700102(final String xml) {
        this();
        MxSeev04700102 tmp = parse(xml);
        shrhldrsIdDsclsrRspn = tmp.getShrhldrsIdDsclsrRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrsIdDsclsrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdersIdentificationDisclosureResponseV02 }
     *     
     */
    public ShareholdersIdentificationDisclosureResponseV02 getShrhldrsIdDsclsrRspn() {
        return shrhldrsIdDsclsrRspn;
    }

    /**
     * Sets the value of the shrhldrsIdDsclsrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdersIdentificationDisclosureResponseV02 }
     *     
     */
    public MxSeev04700102 setShrhldrsIdDsclsrRspn(ShareholdersIdentificationDisclosureResponseV02 value) {
        this.shrhldrsIdDsclsrRspn = value;
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
    public static MxSeev04700102 parse(String xml) {
        return ((MxSeev04700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04700102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04700102) parserImpl.read(MxSeev04700102 .class, xml, _classes));
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
     * Creates an MxSeev04700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04700102 message
     * @return
     *     a new instance of MxSeev04700102
     */
    public final static MxSeev04700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04700102 .class);
    }

}
