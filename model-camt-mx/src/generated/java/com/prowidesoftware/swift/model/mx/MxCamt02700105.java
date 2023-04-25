
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
 * Class for camt.027.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "clmNonRct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.027.001.05")
public class MxCamt02700105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ClmNonRct", required = true)
    protected ClaimNonReceiptV05 clmNonRct;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Case3 .class, CaseAssignment3 .class, CashAccount24 .class, CashAccountType2Choice.class, ClaimNonReceiptV05 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MissingCover3 .class, MxCamt02700105 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation3 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SettlementInstruction3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction3 .class, UnderlyingPaymentTransaction2 .class, UnderlyingStatementEntry1 .class, UnderlyingTransaction3Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.027.001.05";

    public MxCamt02700105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02700105(final String xml) {
        this();
        MxCamt02700105 tmp = parse(xml);
        clmNonRct = tmp.getClmNonRct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02700105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the clmNonRct property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceiptV05 }
     *     
     */
    public ClaimNonReceiptV05 getClmNonRct() {
        return clmNonRct;
    }

    /**
     * Sets the value of the clmNonRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceiptV05 }
     *     
     */
    public MxCamt02700105 setClmNonRct(ClaimNonReceiptV05 value) {
        this.clmNonRct = value;
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
    public static MxCamt02700105 parse(String xml) {
        return ((MxCamt02700105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02700105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02700105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02700105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02700105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02700105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02700105) parserImpl.read(MxCamt02700105 .class, xml, _classes));
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
     * Creates an MxCamt02700105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02700105 message
     * @return
     *     a new instance of MxCamt02700105
     */
    public static final MxCamt02700105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02700105 .class);
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
