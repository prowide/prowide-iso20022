
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
 * Class for seev.037.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.01")
public class MxSeev03700101
    extends AbstractMX
{

    @XmlElement(name = "CorpActnMvmntRvslAdvc", required = true)
    protected CorporateActionMovementReversalAdviceV01 corpActnMvmntRvslAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance4 .class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess3Code.class, AdditionalBusinessProcessFormat3Choice.class, AddressType2Code.class, AlternateIdentification1 .class, BalanceFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption5 .class, CopyDuplicate1Code.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation4 .class, CorporateActionMovementReversalAdviceV01 .class, CorporateActionNarrative4 .class, CorporateActionOption12 .class, CorporateActionOption3Choice.class, CorporateActionOption3Code.class, CorporateActionReversalReason1 .class, CorporateActionReversalReason1Choice.class, CorporateActionReversalReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentNumber1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, IdentificationSource1Choice.class, MxSeev03700101 .class, NameAndAddress5 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, PartyIdentification10Choice.class, PostalAddress1 .class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, Quantity2Choice.class, Quantity6Choice.class, SecuritiesOption5 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.037.001.01";

    public MxSeev03700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03700101(final String xml) {
        this();
        MxSeev03700101 tmp = parse(xml);
        corpActnMvmntRvslAdvc = tmp.getCorpActnMvmntRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementReversalAdviceV01 }
     *     
     */
    public CorporateActionMovementReversalAdviceV01 getCorpActnMvmntRvslAdvc() {
        return corpActnMvmntRvslAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementReversalAdviceV01 }
     *     
     */
    public MxSeev03700101 setCorpActnMvmntRvslAdvc(CorporateActionMovementReversalAdviceV01 value) {
        this.corpActnMvmntRvslAdvc = value;
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
    public static MxSeev03700101 parse(String xml) {
        return ((MxSeev03700101) MxReadImpl.parse(MxSeev03700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03700101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03700101) parserImpl.read(MxSeev03700101 .class, xml, _classes));
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
     * Creates an MxSeev03700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03700101 message
     * @return
     *     a new instance of MxSeev03700101
     */
    public final static MxSeev03700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03700101 .class);
    }

}
